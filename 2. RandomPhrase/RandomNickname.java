public class RandomNickname {
	public static void main (String[] args) {
		String[] nickname = {"Fido","Zeus","Bin","Void","Marks"}; //Определяем массив с возможными вариантами
		int x = nickname.length; //Длина массива 
		int random_nickname = (int) (Math.random() * x); //Рандомно определяем число от 0 до 4
		String your_choose = "Вышу собаку будут звать: " + nickname[random_nickname]; //Состовляем предложение для вывода
		System.out.println(your_choose); //Сообщаем пользователю кличку его питомца 	
	}
}