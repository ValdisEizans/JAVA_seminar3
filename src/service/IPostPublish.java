package service;

import model.enums.PostType;

public interface IPostPublish {
	public abstract void createAndPublishPost(String inputMsg, PostType inputPostType);

}
