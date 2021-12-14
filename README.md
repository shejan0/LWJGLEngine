# LWJGL Engine (deprecated)

This is a LWJGL based engine that I started working on a old laptop but never finished, I might start working on it again at some point
The IDE used was Eclipse 2018-09, as it was the last one to support 32-bit Windows
You need to include [JOML](github.com/JOML-CI/JOML) in a folder titled "JOMLibrary" in the root (version 1.10.1 was used), and [LWJGL](lwjgl.org) in a folder titled "LWJGLibrary" in the root (LWJGL 3.2.3 build 13 was used)


It was supposed to use Threading at the Engine level to run all Game Objects at the same time. All Game Objects in the game code would extend GObject, similar to Unity.

Right now, it gathers data from the system, starts the running process for getting the engine and rendering, and displays red on the screen for the entire display.
If the ESCAPE key is pressed, the program exits.

Work was being done on model importing and 3D rendering using Assimp and OpenGL
