import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
public class Input {
	//this is the function that input code is meant to go to
public void keyboard(long window, int key, int scancode, int action, int mods) {
	if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
		glfwSetWindowShouldClose(window, true); // We will detect this in the rendering loop
}
}
