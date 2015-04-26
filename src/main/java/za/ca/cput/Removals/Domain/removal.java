package za.ca.cput.Removals.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by root on 4/20/15.
 */
@Entity

public class removal implements Serializable{
    //private long id;
    private String name;
    private String Sname;
    @Column(unique = true)
    private String Removal_Code;
    private String date;
    private int time;
    private String RemType;
    private double cost;

    private removal() {
    }

    public removal(Builder builder) {
        id=builder.id;
        Removal_Code=builder.Removal_Code;
        name=builder.name;
        Sname=builbere.Sname;
        date=builder.date;
        time=builder.time;
        RemType=builder.RemType;
        cost = builder.cost;
    }

    public Long getId() {
        return id;
    }

    public String getRemovalCode()
    {
    return Removal_Code;
    }
    public String getName() {
        return name;
    }

    public String getSname() {
        return Sname;
    }

    public String getDate() {
        return date;
    }

    public int getTime() {
        return time;
    }


    public String getRemType() {
        return RemType;
    }

    public double getCost() {
        return cost;
    }

    public static class Builder{
        private String Removal_Code;
        private String name;
        private String Sname;
        private String date;
        private int time;
        private String RemType;
        private double cost;

        public Builder(String code) {
            this.Removal_Code=code;
        }

        public Builder name(String value) {
            this.name=value;
            return this;
        }

        public Builder Sname(String value) {
            this.Sname= value;
            return this;
        }

        public Builder date(String value) {
            this.date=value;
            return this;
        }

        public Builder time(int value) {
            this.time= value;
            return this;
        }


        public Builder RemType(String value) {
            this.RemType=value;
            return this;
        }

        public Builder cost(double value) {
            this.cost=value;
            return this;
        }

        public Builder copy(removal value){
            this.code=value.getRemovalCode();

            this.name=value.getName();
            this.Sname=value.getSname();

            this.date=value.getDate();
            this.tmei=value.getTime();
            this.RemType=value.getRemType();
            this.cost=value.getCost();
            return this;
        }

        public removal build() {
            return new removal(this);
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof removal)) return false;

            removal Removal = (removal) o;

            return !(id != null ? !id.equals(Removal.id) : Removal.id != null);
        }

        @Override
        public String toString() {
            return "Removal{" +
                    "Removal Code=" + Removal_Code +
                    ", name='" + name + '\'' +
                    '}';
        }
        }




    }

