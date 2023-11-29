package ru.pegasagro.car;

import lombok.Builder;
import lombok.Data;
import ru.pegasagro.owner.OwnerDTO;

import java.time.LocalDate;

@Data
@Builder
public class CarDTO {
    private Long idCar;
    private String modelName;
    private LocalDate assemblyDate;
    private String uniqueNumber;
    private OwnerDTO owner;

    public static CarDTO fromEntity(Car car) {
        return CarDTO.builder()
                .idCar(car.getIdCar())
                .assemblyDate(car.getAssemblyDate())
                .uniqueNumber(car.getUniqueNumber())
                .build();
    }
}
