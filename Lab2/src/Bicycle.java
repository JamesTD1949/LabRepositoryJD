public class Bicycle {

        private String owner,make;
        private double price;

        public Bicycle(){

            owner = "Unknown";
            make = "Unknown";
            price = 0.0;
        }

        public Bicycle(String owner, String make, double price){
            setOwner(owner);
            setMake(make);
            setPrice(price);
        }

        public String getOwner(){
            return owner;
        }

        public String getMake() {
            return make;
        }

        public double getPrice() {
            return price;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public void setPrice(double price) {
            this.price = price;
        }
}
