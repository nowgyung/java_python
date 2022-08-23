import imp
import numpy as np
from tensorflow.keras.utils import load_img, img_to_array
import matplotlib.image as mpimg
import tensorflow as tf

model = keras.models.load_model('best-cnn-model.h5') 



for fn in uploaded.keys():

  path='/content/' + fn
  img=image.load_img(path, target_size=(150, 150))

  x=image.img_to_array(img)
  x=np.expand_dims(x, axis=0)
  images = np.vstack([x])

  classes = model.predict(images, batch_size=10)

  print(classes[0])

  if classes[0]>0:
    print(" path 0 is a dog")
  else:
    print(fn + " is a cat")