package tn.esprit.macdoloan.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Withdrawal
 *
 */
@Entity
@Table(name = "Withdrawal")
public class Withdrawal implements Serializable {
	@ManyToOne
	Account account;

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int Id;
	@Column(name = "Amount")
	private float Amount;
	@Column(name = "Date")
	@Temporal(TemporalType.DATE)
	private Date WithdrawalDate;

	public Withdrawal() {
		super();
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public float getAmount() {
		return Amount;
	}

	public void setAmount(float amount) {
		Amount = amount;
	}

	public Date getWithdrawalDate() {
		return WithdrawalDate;
	}

	public void setWithdrawalDate(Date withdrawalDate) {
		WithdrawalDate = withdrawalDate;
	}

	@Override
	public String toString() {
		return "Withdrawal [account=" + account + ", Id=" + Id + ", Amount=" + Amount + ", WithdrawalDate="
				+ WithdrawalDate + "]";
	}
	

}
