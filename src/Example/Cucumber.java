package Example;

class Cars{        public void wheels() {            System.out.println("15");        }  public void Colour() {            System.out.println("blue");        } public void number_of_doors() {            System.out.println("blue");        }    }    class Toyota extends Cars {        public void wheels()        {            System.out.println("4");        }        public void Colour()        {            System.out.println("yellow");        }        public void number_of_doors()        {            System.out.println("5");        }    }    class Ford extends Cars {        public void wheels()        {            System.out.println("3");        }        public void Colour()        {            System.out.println("black");        }        public void number_of_doors()        {            System.out.println("3");        }    }    class Audi extends Cars {        public void carsdetails() {            System.out.println("Wheels size= 10, Colour= Red, number of doors= 5, Steering wheel= right side");        }    }    class Cucumber {        public static void main(String[] args) {            Cars mycars = new Cars();            Cars myToyota = new Toyota();            Cars myFord = new Ford();            Cars myAudi = new Audi();            System.out.println("toyota");            myToyota.Colour();            myToyota.number_of_doors();            myToyota.wheels();        }    }

