package ma.gloster.microservice.business;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ma.gloster.microservice.dto.UserDto;
import ma.gloster.microservice.repository.UserRepository;

/**
 * The Class UserBusinessImpl.
 */
@Transactional
@Service
public class UserBusinessImpl implements IUserBusiness {

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(UserBusinessImpl.class);

	/** The user repository. */
	@Autowired
	public UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ma.gloster.microservice.business.IUserBusiness#updateUser(ma.gloster.
	 * microservice.dto.UserDto)
	 */
	public void updateUser(UserDto userDto) {
		logger.info("> Début UserBusinessImpl.updateUser");
		userRepository.updateUser(userDto.getAddress(), userDto.getStatus(), userDto.getEmail());
		logger.info("< Fin UserBusinessImpl.updateUser");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ma.gloster.microservice.business.IUserBusiness#AfficherUser(ma.gloster.
	 * microservice.dto.UserDto)
	 */
	public void AfficherUser(UserDto userDto) {
		logger.info("> Début UserBusinessImpl.AfficherUser");
		System.out.println(userDto.getAddress());
		System.out.println(userDto.getEmail());
		System.out.println(userDto.getStatus());
		logger.info("< Fin UserBusinessImpl.AfficherUser");
	}
}
