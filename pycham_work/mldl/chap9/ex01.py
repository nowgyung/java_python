from tensorflow import  keras



(train_input, train_target),(test_input, test_target) =\
    keras.datasets.imdb.load_data(num_words=500)

print(train_input.shape)
print(test_input.shape)

from sklearn.model_selection import train_test_split
# from tensorflow.keras.preprocessing.sequence import pad_sequences


train_seq = keras.preprocessing.sequence.pad_sequences(train_input,maxlen=100)
test_seq = keras.preprocessing.sequence.pad_sequences(test_input,maxlen=100)
train_seq,val_seq, train_target,val_target =\
    train_test_split(train_seq,train_target,random_state=42)

train_oh = keras.utils.to_categorical(train_seq)
test_oh = keras.utils.to_categorical(test_seq)
val_oh = keras.utils.to_categorical(val_seq)

print(len(train_seq[0]))
print(train_seq[0])
print(len(train_oh))
print(train_oh.shape)

model = keras.Sequential()

model.add(keras.layers.SimpleRNN(8, input_shape=(100,500)))
model.add(keras.layers.Dense(1,activation='sigmoid'))

rmsprop = keras.optimizers.RMSprop(learning_rate=1e-4)
model.compile(optimizer = rmsprop, loss='binary_crossentropy', metrics='accuracy')

chckpoing_cb = keras.callbacks.ModelCheckpoint('best-simplernn-model.h5', save_best_only=True)
early_stopping_cb = keras.callbacks.EarlyStopping(patience =3, restore_best_weights=True)

history = model.fit(train_oh, train_target, epochs=100, batch_size=64, validation_data=(val_oh,val_target),
                    callbacks=[chckpoing_cb,early_stopping_cb])

score = model.evaluate(train_oh, train_target)
print(score)

