package Course.Course2.Efremov.Lessons.JavaLesson1;

import java.time.LocalDate;

public class Employee {
    private final long id;
    private final String firstname;
    private final String lastname;
    private final LocalDate birthday;

    public Employee(long id, String firstname, String lastname, LocalDate birthday) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    private Employee(Builder builder) {
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.birthday = builder.birthday;
    }

    public static class Builder {
        private long id;
        private String firstname;
        private String lastname;
        private LocalDate birthday;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

}
