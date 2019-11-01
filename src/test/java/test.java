import com.dfbz.comfig.Config;
import com.dfbz.entity.Entity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class test {


    @Autowired
    Entity entity;

    @Test
    public void test1(){
        entity.Direct();
        System.out.println("------------");
        entity.retail();
    }
}
