package pe.com.microjoin.luz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.microjoin.luz.model.Calculo;

@Repository
public interface CalculoRepository extends JpaRepository<Calculo, Long> {
    // Métodos personalizados si es necesario
}