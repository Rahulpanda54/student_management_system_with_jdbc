package student_Management_system;

public class student {
private  int id;
private String Name;
private String phone;
private  String city;

          student(int id,String Name,String Phone,String city){
              super();
              this.id = id;
              this.Name = Name;
              this.phone = Phone;
              this.city = city;
          }

           student(String Name,String Phone,String city){
              super();
              this.Name = Name;
              this.phone = Phone;
              this.city = city;
           }

           student(){

              super();
           }

        public int getStudentId(){
              return id;
        }
        public void setId(int id){
              this.id = id;
        }
        public void setName(String name){
              this.Name = name;
        }
        public String getName(){
              return Name;
        }
        public void setPhone(String Phone){
              this.phone = Phone;
        }
        public String getPhone(){
              return phone;
        }
        public void setCity(String city){
              this.city = city;
        }
        public String getCity(){
              return city;
        }

        public String toString(){
              return "Student [student_id =" + id + " , student_name =" + Name +
                      ",Student_phone=" + phone + "student_city=" + city + "]";

        }


}
