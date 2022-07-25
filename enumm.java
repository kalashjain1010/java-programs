public class enumm {
    
    enum color {
        RED("red"), BLUE("blue");

        private String value;

        color(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        color c1 = color.BLUE;
        System.out.println(color.RED);

        System.out.println(c1.getValue()); 
       
        
    }
}