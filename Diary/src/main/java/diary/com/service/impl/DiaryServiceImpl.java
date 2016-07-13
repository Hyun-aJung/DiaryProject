package diary.com.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import diary.com.service.DiaryService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("diaryService")
public class DiaryServiceImpl extends EgovAbstractServiceImpl implements DiaryService{
	private static final Logger LOGGER = LoggerFactory.getLogger(DiaryServiceImpl.class);
}
