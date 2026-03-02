package advanceJava;

class Box<T>{
	//T - Type, N- Number, V - Value, K- Key, E - Element
	T value;

	T getValue() {
		return value;
	}

	void setValue(T value) {
		this.value = value;
	}
	
}
public class Generics {
public static void main(String[] args) {
	Box<Integer> box=new Box();
	box.setValue(10);
	Box<String> box2=new Box();
	box2.setValue("10");
	
}

}