import java.util.Calendar;

public class Expense {
	
	private int id;
	private String name;
	private String description;
	private double price;
	private Calendar fechaCreacion;
	private Event event;
	private Member owner;
	
	public Expense(int id, String name, String description, double price, Event event, Member owner) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.fechaCreacion = Calendar.getInstance();
		this.event = event;
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Calendar getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Calendar fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Member getOwner() {
		return owner;
	}

	public void setOwner(Member owner) {
		this.owner = owner;
	}
	
	

}
