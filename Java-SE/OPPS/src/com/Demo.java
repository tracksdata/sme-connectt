package com;

class Reservation extends Thread {

	int noofSeats = 2;
	int wantedSeats;

	public Reservation(int wantedSeats) {
		super();
		this.wantedSeats = wantedSeats;
	}

	@Override
	public void run() {

		bookSeat();

	}

	// two threads at a same time enterres in to this method
	public void bookSeat() {
		String tname = Thread.currentThread().getName();
		System.out.println("Watching " + tname + " Avaible Seats: " + noofSeats);

		synchronized (this) {

			if (wantedSeats <= noofSeats) {
				System.out.println(">>>> Booking " + wantedSeats + " seats " + tname);
				noofSeats = noofSeats - wantedSeats;
				System.out.println(wantedSeats + " Booked for " + tname);
			} else {
				System.out.println("No Seats Avaible. Avaible seats are:: " + noofSeats);
			}
		}

	}
}

public class Demo {

	public static void main(String[] args) {

		Reservation r = new Reservation(2);

		Thread redBus = new Thread(r, "Red-Bus");
		Thread xTravells = new Thread(r, "XTravells");

		redBus.start();
		xTravells.start();

	}

}
