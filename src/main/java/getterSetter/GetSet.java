package getterSetter;

public class GetSet {
    public static void main(String[] args) {
        Login login = new Login();
        login.setAge(10);
        login.setId(1);
        login.setName("dsa");
        System.out.println(login.getName() + " " + login.getAge() + " " + login.getId());
    }

    static class Login {
        private String name;
        private int age;
        private int id;

        public Login() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name.isEmpty()) {
                System.out.println("Ошибка");
            } else {

            }
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0) {
                System.out.println("error");
            } else {

            }
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            if (id < 0) {
                System.out.println("error");
            } else {

            }
            this.id = id;
        }
    }
}


