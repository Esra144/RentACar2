package com.kodlamaio.rentACar.Business.Requests.additionalService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAdditionalServiceRequest {
	private int id;
	private int day;
	private double totalPrice;
	private int carId;
}
