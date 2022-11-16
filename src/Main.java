public class Main {
    public static void main(String[] args) {

        Human max = new Human(1988,"Максим", "Минск", "Бренд менеджер");
        System.out.println("Привет! Меня зовут " + max.name + ". Я из города " + max.town + ". Я родился в " + max.yearOfBirth + " году. Я работаю на должности " + max.jobTitle+  ". Будем знакомы!");
        Human anya = new Human (1993,"Аня", "Москва", "Методист образовательных программ");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.town + ". Я родился в " + anya.yearOfBirth + " году. Я работаю на должности " + anya.jobTitle+  ". Будем знакомы!");
        Human katya = new Human(1992, "Катя", "Калининград", "Продакт менеджер");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.town + ". Я родился в " + katya.yearOfBirth + " году. Я работаю на должности " + katya.jobTitle+  ". Будем знакомы!");
        Human artem = new Human(1995, "Артем", "Москва", "Директор по развитию бизнеса");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.town + ". Я родился в " + artem.yearOfBirth + " году. Я работаю на должности " + artem.jobTitle+  ". Будем знакомы!");



        Car lada = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        System.out.println("Марка машины " + lada.brand + ". Модель " + lada.model + ". Объем двигателя " +  lada.engineVolume + ". Цвет кузова " +  lada.color + ". Год выпуска " +  lada.year + ". Сборка " +  lada.country);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        System.out.println("Марка машины " + audi.brand + ". Модель " + audi.model + ". Объем двигателя " +  audi.engineVolume + ". Цвет кузова " +  audi.color + ". Год выпуска " +  audi.year + ". Сборка " +  audi.country);
        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        System.out.println("Марка машины " + bmw.brand + ". Модель " + bmw.model + ". Объем двигателя " +  bmw.engineVolume + ". Цвет кузова " +  bmw.color + ". Год выпуска " +  bmw.year + ". Сборка " +  bmw.country);
        Car kia = new Car("Kia", "Sportage 4", 2.4, "Красный", 2018, "Южная Корея");
        System.out.println("Марка машины " + kia.brand + ". Модель " + kia.model + ". Объем двигателя " +  kia.engineVolume + ". Цвет кузова " +  kia.color + ". Год выпуска " + kia.year + ". Сборка " +  kia.country);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        System.out.println("Марка машины " + hyundai.brand + ". Модель " + hyundai.model + ". Объем двигателя " +  hyundai.engineVolume + ". Цвет кузова " +  hyundai.color + ". Год выпуска " +  hyundai.year + ". Сборка " +  hyundai.country);





    }
}