package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class TGIFStepdefs {
    private String today;
    private String result;

    @Given("오늘은 일요일이다")
    public void 오늘은일요일이다() {
        today = "Sunday";
    }

    @Given("오늘은 금요일이다")
    public void 오늘은금요일이다() {
        today = "Friday";
    }

    @When("오늘이 금요일인지 물으면")
    public void 오늘이금요일인지물으면() {
        result = IsItFriday.isItFriday(today);
    }

    @Then("{string}이라는 답을 얻어야 함")
    public void 이라는답을얻어야함(String arg0) {
        Assertions.assertThat(result).isEqualTo(arg0);
    }
}
