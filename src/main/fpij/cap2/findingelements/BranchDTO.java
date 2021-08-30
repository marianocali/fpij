package main.fpij.cap2.findingelements;

public class BranchDTO {

    private Integer id;

    private String dimension;

    private String zone;

    private String seniority;

    private NeighborhoodDTO neighborhood;

//    private CityDTO city;

//    private DepartmentDTO department;

    private Double latitude;

    private Double longitude;

    private String supervisor;

    private Integer sqrtMeters;

    private String name;

//    private BranchType type;

    private Integer distance;

    private String address;

    private String telephoneNumber;

    private String[] schedule;

    private Boolean isOpen;

    private Boolean is24Hours;

    private BranchDTO(Builder builder) {
        this.id = builder.id;
        this.dimension = builder.dimension;
        this.zone = builder.zone;
        this.seniority = builder.seniority;
        this.neighborhood = builder.neighborhood;
//        this.city = builder.city;
//        this.department = builder.department;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.supervisor = builder.supervisor;
        this.sqrtMeters = builder.sqrtMeters;
        this.name = builder.name;
//        this.type = builder.type;
        this.distance = builder.distance;
        this.address = builder.address;
        this.telephoneNumber = builder.telephoneNumber;
        this.schedule = builder.schedule;
        this.isOpen = builder.isOpen;
        this.is24Hours = builder.is24Hours;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public NeighborhoodDTO getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(NeighborhoodDTO neighborhood) {
        this.neighborhood = neighborhood;
    }

//    public CityDTO getCity() {
//        return city;
//    }

//    public void setCity(CityDTO city) {
//        this.city = city;
//    }

//    public DepartmentDTO getDepartment() {
//        return department;
//    }

//    public void setDepartment(DepartmentDTO department) {
//        this.department = department;
//    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Integer getSqrtMeters() {
        return sqrtMeters;
    }

    public void setSqrtMeters(Integer sqrtMeters) {
        this.sqrtMeters = sqrtMeters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public BranchType getType() {
//        return type;
//    }
//
//    public void setType(BranchType type) {
//        this.type = type;
//    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getIs24Hours() {
        return is24Hours;
    }

    public void setIs24Hours(Boolean is24Hours) {
        this.is24Hours = is24Hours;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private Integer id;
        private String dimension;
        private String zone;
        private String seniority;
        private NeighborhoodDTO neighborhood;
        //        private CityDTO city;
//        private DepartmentDTO department;
        private Double latitude;
        private Double longitude;
        private String supervisor;
        private Integer sqrtMeters;
        private String name;
        //        private BranchType type;
        private Integer distance;
        private String address;
        private String telephoneNumber;
        private String[] schedule;
        private Boolean isOpen;
        private Boolean is24Hours;

        private Builder() {
        }

        public Builder withId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder withDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder withZone(String zone) {
            this.zone = zone;
            return this;
        }

        public Builder withSeniority(String seniority) {
            this.seniority = seniority;
            return this;
        }

        public Builder withNeighborhood(NeighborhoodDTO neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }

//        public Builder withCity(CityDTO city) {
//            this.city = city;
//            return this;
//        }
//
//        public Builder withDepartment(DepartmentDTO department) {
//            this.department = department;
//            return this;
//        }

        public Builder withLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder withLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder withSupervisor(String supervisor) {
            this.supervisor = supervisor;
            return this;
        }

        public Builder withSqrtMeters(Integer sqrtMeters) {
            this.sqrtMeters = sqrtMeters;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

//        public Builder withType(BranchType type) {
//            this.type = type;
//            return this;
//        }

        public Builder withDistance(Integer distance) {
            this.distance = distance;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withTelephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
            return this;
        }

        public Builder withSchedule(String[] schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder withIsOpen(Boolean isOpen) {
            this.isOpen = isOpen;
            return this;
        }

        public Builder withIs24Hours(Boolean is24Hours) {
            this.is24Hours = is24Hours;
            return this;
        }

        public BranchDTO build() {
            return new BranchDTO(this);
        }
    }
}
