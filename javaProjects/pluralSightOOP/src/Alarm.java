public class Alarm {
        String message;
        boolean active;
        public Alarm(String message){
            this.message=message;
            this.active = false;
        }
        public void turnOn(){
            active = true;
        }
        public String getReport(){
            return null;
        }
        public String getReport(boolean upperCase){
            if(active){
                if(upperCase) return message.toUpperCase();
                return message;
            }
            return "";
        }
        public void sendReport(){
            System.out.println(getReport(true));
        }
}

