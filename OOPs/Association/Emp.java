package OOPs.Association;

    class Job {
        private String role;
        private long salary;
        private int id;

        public String getRole() {
            return role;
        }
        public void setRole(String role) {
            this.role = role;
        }
        public long getSalary() {
            return salary;
        }
        public void setSalary(long salary) {
            this.salary = salary;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
    }
    class People {
        private Job job;

        public People(){
            this.job=new Job();
            job.setSalary(1000L);
            job.setId(00001);
            job.setRole("Assistant");
        }
        public long getSalary() {
            return job.getSalary();
        }
        public String getRole() {
            return job.getRole();
        }
        public int getId() {
            return job.getId();
        }

    }
    class Emp {

        public static void main(String[] args) {
            Job jobs = new Job();
            People person = new People();
            long salary = person.getSalary();
            System.out.println(person.getSalary());
            System.out.println(person.getId());
            System.out.println(person.getRole());

        }
    }