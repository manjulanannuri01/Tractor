package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@Table(name="tractors")
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity

public class Tractor {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id;

		//@Column(nullable = false, length = 50)

		private String brand;

		@Column(length = 50) private String model;

		@Column(name="engine_power", length = 50)

		private String enginePower;

		@Column(length = 50) private String transmission;

		@Column(name="fuel_type", length = 50)

		private String fuelType;

		//@Column(precision = 10, scale = 2)

		private Double price;

		@Column(columnDefinition = "TEXT")

		private String description;

		@Column(name="image_url", columnDefinition = "TEXT")

		private String imageUrl;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getEnginePower() {
			return enginePower;
		}

		public void setEnginePower(String enginePower) {
			this.enginePower = enginePower;
		}

		public String getTransmission() {
			return transmission;
		}

		public void setTransmission(String transmission) {
			this.transmission = transmission;
		}

		public String getFuelType() {
			return fuelType;
		}

		public void setFuelType(String fuelType) {
			this.fuelType = fuelType;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
	}

		
		
}



