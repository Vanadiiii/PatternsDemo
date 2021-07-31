package ru.imatveev.structural.adapter;

/**
 * <h1>data adapter (converter)</h1>
 * <h1>aka 'MAPPER'</h1>
 */
public class PassportToPersonalInfoAdapter {
    public PersonalInfoDto map(PassportDto passportDto) {
        if (passportDto == null) {
            return null;
        }

        String passport = passportDto.serial() + " " + passportDto.number();
        String[] nameParts = passportDto.fullName().split(" ");
        return new PersonalInfoDto(nameParts[0], nameParts[1], passport);
    }
}
