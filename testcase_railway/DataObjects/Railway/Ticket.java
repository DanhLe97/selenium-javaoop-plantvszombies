package Railway;

public class Ticket {

	public enum Station {
		SAIGON("1"), PHANTHIET("2"), NHATRANG("3"), DANANG("4"), HUE("5"), QUANGNGAI("6");

		private String value;

		Station(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}

	}

	public enum SeatType {
		HARDSEAT("Hard seat"), SOFTSEAT("Soft seat"), SOFTSEATWITHAIRCONDITIONER("Soft seat with air conditioner"),
		HARDBED("Hard bed"), SOFTBED("Soft bed"), SOFTBEDWITHAIRCONDITIONER("Soft bed with air conditioner");

		private String seatType;

		SeatType(String seatType) {
			this.seatType = seatType;
		}

		public String getSeatType() {
			return this.seatType;
		}
	}

}
