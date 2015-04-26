package za.ca.cput.Removals.Domain;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by root on 4/20/15.
 */
@Entity

public class Customer implements Serializable{

    //private Long id;
    private String firstName;
    private String lastName;


    private Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public Customer(Builder builder){
        firstName=builder.firstName;
        lastName=builder.lastName;

    }

    public static class Builder{
        private String firstName;
        private String lastName;


        public Builder(String lastName) {
            this.lastName = lastName;
        }

        public Builder firstName(String value){
            this.firstName=value;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
