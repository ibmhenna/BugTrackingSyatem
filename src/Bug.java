
public class Bug {
	private int id;
	private String name;
	private String priority;
	private String location;
	private String buildVersion;
	private BUGTYPE type = BUGTYPE.LOGICAL;
	private static BUGSTATUS status = BUGSTATUS.NEW;
	private SEVERITY severity = SEVERITY.MILD;

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

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

}
