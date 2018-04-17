package wang.angi.sample.reactive.redis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.core.ReactiveValueOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.test.StepVerifier;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleReactiveRedisApplicationTests {

    @Autowired
    private ReactiveRedisTemplate<String, String> reactiveRedisTemplate;

//    @Resource(name = "reactiveRedisTemplate")
//    private ReactiveValueOperations<String, String> valueOps;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testReactiveRedisTemplate() {
        StepVerifier.create(reactiveRedisTemplate.opsForValue().set("key3", "value3")).expectNext(true);
        StepVerifier.create(reactiveRedisTemplate.opsForValue().get("key3")).expectNext("value3");
    }

//    @Test
//    public void testValueOperations() {
//        StepVerifier.create(valueOps.set("key4", "value4")).expectNext(true);
//        StepVerifier.create(valueOps.get("key4")).expectNext("value4");
//    }

}
