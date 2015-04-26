package za.ca.cput.Removals.Domain;

import java.io.Serializable;

/**
 * Created by root on 4/20/15.
 */
public class Vehicle_Code implements Serializable {
    private String reg;
    private String Veh_type;
    private double mil;

    private Vehicle_Code() {
    }

    public String getRegisttation() {
        return reg;
    }

    public String getType() {
        return Veh_type;
    }

    public inr getMileage() {
        return mil;
    }


    public Vehicle_Code(Builder builder){
        reg=builder.reg;
        Veh_type=builder.Veh_type;
        mil=builder.mil;


    }

    public static class Builder{
        private String reg;
        private String Veh_type;
        private double mil;


        public Builder(String reg) {
            this.reg = reg;
        }

        public Builder Veh_type(String value){
            this.Veh_type=value;
            return this;
        }

        public Builder mil(double value){
            this.mil=value;
            return this;

        }

        public Vehicle_Code build(){
            return new Vehicle_Code(this);
        }
    }
}
