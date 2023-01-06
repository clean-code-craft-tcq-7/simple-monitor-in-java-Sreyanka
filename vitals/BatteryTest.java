package vitals;

public class BatteryTest {
	public static void assertBatteryTest() {
		BatteryControl batterycontrol = new BatteryControl();
		assert (batterycontrol.batteryIsOk(25, 70, 0.7f) == true);
		assert (batterycontrol.batteryIsOk(50, 85, 0.0f) == false);
		assert (batterycontrol.batteryIsOk(35, 60, 0.8f) == true);
		assert (batterycontrol.batteryIsOk(45, 80, 0.79f) == true);
		assert (batterycontrol.batteryIsOk(0, 20, 0.6f) == true);
		assert (batterycontrol.batteryIsOk(75, 100, 2.0f) == false);
		assert (batterycontrol.batteryIsOk(0, 2, 0.2f) == false);
	}
}
