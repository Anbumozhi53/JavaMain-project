@RestController
@RequestMapping("/api/buses")
public class BusController {
    @Autowired
    private BusRepository busRepository;

    @GetMapping
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    @PostMapping
    public Bus createBus(@RequestBody Bus bus) {
        return busRepository.save(bus);
    }
}
