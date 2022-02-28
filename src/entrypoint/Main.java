package entrypoint;


import ui.MenusUi;

public class Main {

	public static void main(String[] args) {
		MenusUi ui = new MenusUi();
		ui.createConfigFile();
        ui.menu();
	}
}
