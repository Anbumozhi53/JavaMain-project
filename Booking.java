@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Bus bus;
    private String passengerName;
    private String seatNumber;
    private LocalDateTime bookingTime;
    
}
