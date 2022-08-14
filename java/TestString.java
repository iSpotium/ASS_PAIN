import java.util.List;

public class TestString {

	public String[] splitString(String str) {
		// TODO Auto-generated method stub
		str = str.replace(" : ", ", ");
		String[] arrstr = str.split(", ");

		return arrstr;
	}

////////////////////////////////////////////////////////////
	public Oven initOven(String[] arr) {

		Oven ov = new Oven();

		String value;
		int val;
		double val2;

		value = arr[0];
		ov.setName(value);

		value = arr[1];
		String[] tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		ov.setPowerConsumption(val);

		value = arr[2];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		ov.setWeight(val);

		value = arr[3];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		ov.setCapacity(val);

		value = arr[4];
		tempVal = value.split("=");
		value = tempVal[1];
		val = Integer.parseInt(value);
		ov.setDepth(val);

		value = arr[5];
		tempVal = value.split("=");
		value = tempVal[1];
		val2 = Double.parseDouble(value);
		ov.setHeight(val2);

		value = arr[6];
		tempVal = value.split("=");
		value = tempVal[1];
		val2 = Double.parseDouble(value);
		ov.setWidth(val2);

		return ov;
	}

////////////////////////////////////////////////////////////////////
	public void printObj(List<Oven> ov) {
		for (Oven i : ov) {
			System.out.println("Name: " + i.getName() + ", Power Consumption: " + i.getPowerConsumption() + ", Weight: "
					+ i.getWeight() + ", Capacity: " + i.getCapacity() + ", Depth: " + i.getDepth() + ", Height: "
					+ i.getHeight() + ", Width: " + i.getWidth());
		}

	}
}
