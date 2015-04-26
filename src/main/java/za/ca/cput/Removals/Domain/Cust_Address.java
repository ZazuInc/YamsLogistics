package za.ca.cput.Removals.Domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by root on 4/20/15.
 */@Embeddable
public class Cust_Address implements Serializable {

    private String Street_Name;
    private int house_num;
    private String postalCode;

    public Cust_Address(Builder builder) {
        Street_Name=builder.Street_Name;
        house_num =builder.house_num
        postalCode=builder.postalCode;
    }

    public String getStreetName() {
        return Street_Name;
    }

    public int getHouseNum(){
        return house_num;}

    public String getPostalCode() {
        return postalCode;
    }

    public static class Builder{
        private String Street_Name;
        private int house_num
        private String postalCode;


        public Builder(int house_num){
            this.house_num=house_num;
        }

        public Builder Street_Name(String value) {
            this.Street_Name = value;
            return this;
        }
        public Builder postalCode(String value){
            this.postalCode=value;
            return this;
        }

        public Builder copy(Cust_Address value){
            this.Street_Name=value.Street_Name;
            this.house_num=value.house_num;
            this.postalCode=value.postalCode;

            return this;
        }

        public Cust_Address build(){
            return new Cust_Address(this);
        }
    }
}
