import java.util.ArrayList;
import java.util.List;

public final class SistemaCC {
	private List<Member> members;
	private List<Expense> expenses;
	private List<Event> events;
	private int idMember = 0;
	private int idExpense = 0;
	private int idEvent = 0;
	
	public SistemaCC() {
		members = new ArrayList<Member>();
		expenses = new ArrayList<Expense>();
		events = new ArrayList<Event>();
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
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	public int getidMember() {
		return idMember;
	}
	public void setidMember(int idMember) {
		this.idMember = idMember;
	}
	public int getidExpense() {
		return idExpense;
	}
	public void setidExpense(int idExpense) {
		this.idExpense = idExpense;
	}
	public int getidEvent() {
		return idEvent;
	}
	public void setidEvent(int idEvent) {
		this.idEvent = idEvent;
	}
	
	//ABM Members
	public boolean altaMember(String name, String email, double balance) {
		Member persona = findMember(name);
		if(persona != null)
			return false;
		else{
			members.add(new Member(idMember, name, email, balance));
			idMember++;
			return true;
		}
	}
	public boolean bajaMember(String name) {
		int id = -1;
		for(Member m : members){
			if (m.getName() == name)
				id = m.getId();
		}
		if (id == -1)
			return false;
		else{
			for (Expense e : expenses){ 	//Borro los expenses de la persona primero
				if (e.getOwner().getName() == name){
					expenses.remove(e.getId());
				}
			}
			members.remove(id);
			return true;
		}
	}
	public void modificarMember(String name, String email) {
		Member persona = findMember(name);
		persona.setName(name);
		persona.setEmail(email);
	}
	public Member findMember(String name) {
		Member member = null;
		for (Member m : members){
			if (m.getName() == name)
					member = m;
		}
		return member;
	}

	//ABM Expenses
	public boolean altaExpense(String name, String descripcion, double monto, String nameEvent, String nameOwner) {
		Member propietario = findMember(nameOwner);
		Event events = findEvent(nameEvent);
		if (propietario != null && events != null){
			expenses.add(new Expense(idExpense, name, descripcion, monto, events, propietario));
			idExpense++;
			return true;
		}
		return false;
		
	}
	public boolean bajaExpense(String name) {
		Expense expense = findExpense(name);
		if (expense != null)
			expenses.remove(expense.getId());
		return (expenses != null);
	}
	public void modificarExpense(String name, String descripcion, double monto, String nameEvent, String nameOwner) {
		Expense expense = findExpense(name);
		if(expense != null){
			expense.setName(name);
			expense.setDescription(descripcion);
			expense.setPrice(monto);
			expense.setEvent(findEvent(nameEvent));
			expense.setOwner(findMember(nameOwner));
		}
	}
	public Expense findExpense(String name){
		Expense expense = null;
		for(Expense e : expenses){
			if(e.getName() == name)
				expense = e;
		}
		return expense;
	}
	
	//ABM Events
	public boolean altaEvent(String name, String descripcion){
		if(name != "")
			{
			events.add(new Event(idEvent, name, descripcion));
			idEvent++;
			}
		return (name != "");
	}
	public void modificarEvent(String name, String descripcion){
		Event event = findEvent(name);
		event.setName(name);
		event.setDescription(descripcion);
	}
	public boolean bajaEvent(String name){
		Event event = findEvent(name);
		if (event != null){
			for(Expense e : event.getExpenses()){
				expenses.remove(e.getId());			
			}
			events.remove(event.getId());
			return true;
		}
		return false;
	}
	public Event findEvent(String name){
		for(Event e : events){
			if (e.getName() == name)
				return e;
		}
		return null;
	}

}
