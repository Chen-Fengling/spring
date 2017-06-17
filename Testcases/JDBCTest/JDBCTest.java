package JDBCTest;

import com.ccsdt.JDBC.Actor;
import com.ccsdt.JDBC.ActorDao;
import com.ccsdt.JDBC.MyDaoSupport;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 2017/6/17.
 */
public class JDBCTest {
    private ApplicationContext ctx = null;
    private JdbcTemplate jdbcTemplate;
    private MyDaoSupport myDaoSupport;
    private ActorDao actorDao;

    {
        ctx = new ClassPathXmlApplicationContext("JDBC/Spring-JDBCTest.xml");
        jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        myDaoSupport = ctx.getBean(MyDaoSupport.class);
        actorDao = ctx.getBean(ActorDao.class);

    }

    @Test
    void connectionTest(){
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
    }

    /**
     * 更新一条记录
     */
    @Test
    void updateTest(){
        String update = "update actor_test set first_name = ? where actor_id =?";
        jdbcTemplate.update(update,"EG",3);
    }
    /**
     * 批量插入记录
     * 最后一个参数是List<Object[]>
     */
    @Test
    void batchUpdateTest(){
        String update = "insert into actor_test(first_name,last_name,last_update) values(?,?,?)";
        List<Object[]> actors = new ArrayList<>();
        actors.add(new Object[]{"ccsdt","fengling","2017-06-17 22:34:33"});
        actors.add(new Object[]{"Runyu","Chen","2017-06-17 22:34:33"});
        actors.add(new Object[]{"Mao","XinChu","2017-06-17 22:34:33"});

        int[] i=jdbcTemplate.batchUpdate(update,actors);
        for (int j:i){
            System.out.println(j);
        }
    }

    /**
     * 从数据库查询一条记录，得到实际一个对象
     * 注意：不是调用queryForObject(String sql,Class<T> requiredType,Object... args)
     * 而是调用queryForObject(String sql, RowMapper<com.ccsdt.JDBC.Actor> rowMapper, Object... args)方法
     * 1、其中RowMapper<>定义如何去映射结果集的行，从用实现类为BeanPropertyRowMapper<>(Object.class)
     * 2、使用的SQL中的列名和属性名的映射，列如first_name firstName
     * 3、不支持级联属性的映射，JdbcTemplate是一个JDBC的小工具而不是ORM框架
     */
    @Test
    void queryForObjectTest(){
        String select = "select actor_id id,first_name firstName,last_name lastName,last_update lastUpdate from actor_test where actor_id =?";
        RowMapper<Actor> rowMapper = new BeanPropertyRowMapper<>(Actor.class);
        System.out.println(jdbcTemplate.queryForObject(select,rowMapper,3));
    }

    /**
     * 查询多条数据，得到实体类的集合
     * 注意调用的是query(String sql, RowMapper<com.ccsdt.JDBC.Actor> rowMapper, Object... args)
     */
    @Test
    void queryForList(){
        String select = "select actor_id id,first_name firstName,last_name lastName,last_update lastUpdate from actor_test where actor_id <?";
        RowMapper<Actor> rowMapper = new BeanPropertyRowMapper<>(Actor.class);
        List<Actor> actors = jdbcTemplate.query(select,rowMapper,3);
        for (Actor actor:actors){
            System.out.println(actor);
        }
    }

    /**
     * 查询单个字段或者做count统计
     */
    @Test
    void queryForObject(){
        String select = "select count(actor_id) from actor_test";
        int i = jdbcTemplate.queryForObject(select,Integer.class);
        System.out.println(i);

    }

    @Test
    void actorDaoTest(){
        System.out.println(actorDao.getActorById(3));
    }

    @Test
    void MydaoSupport(){
        System.out.println(myDaoSupport.getActorById(3));
    }
}
