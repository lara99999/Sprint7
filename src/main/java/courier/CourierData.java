package courier;
import org.apache.commons.lang3.RandomStringUtils;
public class CourierData {
    // рандомное создание данных курьера
        private String login;
        private String password;
        private String firstName;
        public CourierData(String login, String password, String firstName) {
            this.login = login;
            this.password = password;
            this.firstName = firstName;
        }
        public CourierData() {
        }
        public static courier.CourierData getCourierCorrect() {
            return new courier.CourierData(
                    RandomStringUtils.randomAlphanumeric(10),
                    "12345",
                    RandomStringUtils.randomAlphabetic(10)
            );
        }
        public static courier.CourierData getCourierWithoutLogin() {
            return new courier.CourierData(
                    "",
                    "12345",
                    RandomStringUtils.randomAlphabetic(10)
            );
        }
        public static courier.CourierData getCourierWithoutPassword() {
            return new courier.CourierData(
                    RandomStringUtils.randomAlphanumeric(10),
                    "",
                    RandomStringUtils.randomAlphabetic(10)
            );
        }
        public String getLogin() {
            return login;
        }
        public void setLogin(String login) {
            this.login = login;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    }
