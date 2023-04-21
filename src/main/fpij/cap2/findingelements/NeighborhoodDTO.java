package main.fpij.cap2.findingelements;

public class NeighborhoodDTO {

    private Long id;

    private String name;

    private Long cityId;

    private NeighborhoodDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.cityId = builder.cityId;
    }

    public NeighborhoodDTO() {
        this.cityId = Long.valueOf(-1);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private Long id;
        private String name;
        private Long cityId;

        private Builder() {
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCityId(Long cityId) {
            this.cityId = cityId;
            return this;
        }

        public NeighborhoodDTO build() {
            return new NeighborhoodDTO(this);
        }
    }
}
