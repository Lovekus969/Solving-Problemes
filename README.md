# M8Comp Car Simulator

A simple Java simulation of a BMW M8 Competition custom build with turbo upgrades and basic car controls.

## Features

- **Install Components:** Front grill, radiator, and twin turbo vents.
- **Engine Control:** Start and stop the engine with dependency checks.
- **RPM Management:** Increase and decrease RPM while engine is running.
- **Honking:** Simulate honking anytime.

## How to Use

1. **Create** an instance of `M8Comp`.
2. **Install** all required components (`installGrill()`, `installRadiator()`, `installTurboVents()`).
3. **Start** the engine (`startEngine()`) — only works if all parts are installed.
4. **Adjust RPM** with `increaseRPM(int)` and `decreaseRPM(int)` while the engine is on.
5. **Honk** anytime with `honk()`.
6. **Stop** the engine with `stopEngine()`.
