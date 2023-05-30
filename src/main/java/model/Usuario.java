package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_gabriel", schema = "public")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_nr_id")
    private Integer usuNrId;
	@Column(name = "usu_tx_nome")
	private String nome;
	@Column(name = "usu_tx_fone")
	private String fone;
	@Column(name = "usu_tx_email")
	private String email;
	@Column(name = "usu_dt_datanascimento")
	private LocalDate dataNascimento;
}
