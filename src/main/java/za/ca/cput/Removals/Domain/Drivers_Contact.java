package za.ca.cput.Removals.Domain;

import javax.persistence.Embeddable;

/**
 * Created by root on 4/20/15.
 */
@Embeddable
public class Drivers_Contact {

    private String telephone;
    private String email;

    public Drivers_Contact(Builder builder) {
        email=builder.email;
        telephone=builder.telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }


    public static class Builder{
        private String email;
        private String telephone;

        public Builder telephone(String value){
            this.telephone=value;
            return this;
        }

        public Builder(String email) {
            this.email = email;
        }

        public Builder copy(Drivers_Contact value){
            this.telephone=value.telephone;
            this.email=value.email;
            return this;
        }

        public Drivers_Contact build(){
            return new Drivers_Contact(this);
        }
    }
}
