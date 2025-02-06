public abstract class Animal {

        private int age;


        public Animal(int age){
            this.age = age;
        }

        public Animal(){
            age = 0;
        }


        public void setAge(int a){
            age = a;
        }

        public int getAge(){
            return age;
        }


    //if a class has an abstract method the entire class needs to be abstract
    public abstract void eat();



}
