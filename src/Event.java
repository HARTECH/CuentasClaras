import java.util.Calendar;
import java.util.List;

public class Event {
	
	private int id;
	private String name;
	private String descripcion;
	private Calendar fecha;
	private List<Member> members;
	private List<Expense> expenses;
	
	public Event(int id, String name, String descripcion) {
		super();
		this.id = id;
		this.name = name;
		this.descripcion = descripcion;
		this.fecha = Calendar.getInstance();
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
		return descripcion;
	}

	public void setDescription(String descripcion) {
		this.descripcion = descripcion;
	}

	public Calendar getDate() {
		return fecha;
	}

	public void setDate(Calendar fecha) {
		this.fecha = fecha;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}

	

}
