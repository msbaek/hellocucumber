package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class TGIFTableStepdefs {
    private String today;
    private String actual;

    @Given("오늘은 {string} 요일이다")
    public void 오늘은요일이다(String arg0) {
        today = arg0;
    }

    @When("금요일인지 물으면")
    public void 금요일인지물으면() {
        actual = IsItFriday.isItFriday(today);
    }

    @Then("예산되는 답변 {string}을 받아야 함")
    public void 예산되는답변을받아야함(String arg0) {
        assertThat(actual).isEqualTo(arg0);
    }
}
