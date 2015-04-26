package za.ca.cput.Removals.Domain;

import javax.persistence.Entity;

/**
 * Created by root on 4/20/15.
 */
@Entity
public class Drivers {
    private String firstName;
    private String lastName;
    private int Driver_Code;

    private Drivers() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public inr getDriver_Code() {
        return Driver_Code;
    }


    public Drivers(Builder builder){
        Driver_Code=builder.Driver_Code;
        firstName=builder.firstName;
        lastName=builder.lastName;


    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int Driver_Code;



        public Builder(String lastName) {
            this.lastName = lastName;
        }

        public Builder firstName(String value){
            this.firstName=value;
            return this;
        }

        public Builder Driver_Code(int value){
            this.Driver_Code=value;
            return this;

        }

        public Drivers build(){
            return new Drivers(this);
        }
    }
}
