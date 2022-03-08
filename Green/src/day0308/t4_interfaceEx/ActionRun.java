package day0308.t4_interfaceEx;

public class ActionRun {
	public static void main(String[] args) {
		Action[] action = {new PoliceMan(), new FireMan(), new Chef()};
		String[] title = {"경찰관", "소방관", "요리사"};
		
		for(int i = 0; i < action.length; i++) {
			System.out.println(title[i] + "의 역할은? ");
			action[i].catching();
			action[i].search();
			action[i].fire();
			action[i].rescue();
			action[i].cooking();
			action[i].spagetti();
			System.out.println("===========================");
		}
	}
}
