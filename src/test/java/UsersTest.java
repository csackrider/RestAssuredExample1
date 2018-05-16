import io.restassured.response.Response;
import models.User;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;

public class UsersTest extends TestBase {

    //The simplest case of Rest-Assured Usage: simple get and status code verification
    @Test
    public void shouldFetchListOfAllUsers() {
        REQUEST.get("/users")
                .then()
                    .statusCode(200);
    }

    //Here I use more built-in assertions for checking simple JSON data
    @Test
    public void shouldGetFirstUserAndVerifyFirstNameAndId(){
        REQUEST.get("/users/1")
                .then()
                    .statusCode(200)
                .and()
                    .body("id", equalTo(1))
                    .body("name", equalTo("Leanne Graham"));
    }


}
